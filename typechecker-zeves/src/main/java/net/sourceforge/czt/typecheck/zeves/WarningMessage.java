/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.sourceforge.czt.typecheck.zeves;

/**
 *
 * @author leo
 */
public enum WarningMessage {
  // NOTE: in "\n\tXXX.......":, the "XXX.......".length()= 10 for beautification (see WarningManager loc info)

//  USE_CMD_EMPTY_INST(
//    "Empty instantiation list in use command." +
//    "\n\tIn proof...........: {0}" +
//    "\n\tTheorem reference..: {1}",
//    "We are not checking if instantiated variables in use command have a matching bounded variable in {1}. We let Z/Eves do that."
//  ),

  SUBST_CMD_EXPR_EQS("Not checking equality substitute expression."
                    + "\n\tIn proof...: {0}"
                    + "\n\tat expr....: {1}"
                    + "\n\twith type..: {2}",
                    "We are not checking if explicit expression {1} in equality substitute is present in hypothesis list."),

  SUBST_CMD_INVALID_EQS("Invalid substitution command: non-null pred or proof command in equality substitute\n\tIn proof...: {0}\n\tCommand....: {1}", "Wrongly parsed equality substitute command in {1} of proof {0}."),
  SUBST_CMD_INVALID_INVOKE("Invalid substitution command: non-null expr or proof command in invoke\n\tIn proof...: {0}\n\tCommand....: {1}", "Wrongly parsed invoke command in {1} of proof {0}."),

  SPLIT_CMD_INVALID_PRED("Invalid split command: null pred.\n\tIn proof...: {0}\n\tCommand....: {1}", "Wrongly parsed split command in {1} of proof {0}."),

  APPLY_CMD_INVALID("Invalid apply command: non-null proof command or empty thm name in apply command\n\tIn proof...: {0}\n\tCommand....: {1}", "Wrongly parsed apply command command in {1} of proof {0}."),
  APPLY_CMD_EXPR("Not checking apply command expression."
                    + "\n\tIn proof...: {0}"
                    + "\n\tat expr....: {1}"
                    + "\n\twith type..: {2}",
                    "We are not checking if explicit expression {1} in apply command is present in hypothesis list."),


  COULD_NOT_RESOLVE_PRED("Could not resolve predicate in ''{0}''." +
      "\n\tTerm......: {1}" +
      "\n\tPred......: {2}",
      "A second attempt to resolve the given predicate has failed. This might happen because of usage before\n\t" +
      "declaration, which is not allowed, or because of an ill-formed term."),

 
  UNKNOWN_TERM("Typechecker is being asked to visit a unknown term" +
    "\n\tChecker...: {0}" +
    "\n\tTerm......: {1}", 
    "A unknown term can only be found if some type rule is missing or an ill-formed term\n\t" +
    "is given to typecheck. This should never happen for parsed terms.") // or bug in TC(?!)   
  ;
  
  private final String message_;
  private final String explanation_;
  private boolean flagged_;

  WarningMessage(String message)
  {
    this(message, null);
  }

  WarningMessage(String message, String explanation)
  {    
    message_ = message;
    explanation_ = explanation;
    flagged_ = false;
  }

  String getMessage()
  {
    return message_;
  }

  String getExplanation()
  {
    String result = explanation_;
    flagged_ = true;
    return result;
  }
  
  boolean alreadyFlagged()
  {
    return flagged_;
  }
  
  String getFullMessage()
  {
    String result = getMessage();
    if (!flagged_) result += "\n\t" + getExplanation();
    return result;
  }
}