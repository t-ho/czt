/*
  Copyright (C) 2005 Petra Malik
  This file is part of the czt project.

  The czt project contains free software; you can redistribute it and/or modify
  it under the terms of the GNU General Public License as published by
  the Free Software Foundation; either version 2 of the License, or
  (at your option) any later version.

  The czt project is distributed in the hope that it will be useful,
  but WITHOUT ANY WARRANTY; without even the implied warranty of
  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  GNU General Public License for more details.

  You should have received a copy of the GNU General Public License
  along with czt; if not, write to the Free Software
  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
*/

package net.sourceforge.czt.parser.util;

public enum ParseMessage
{
  MSG_EXPR_EXPECTED,
  MSG_EXPR_EXPECTED_FOUND_PRED,
  MSG_PRED_EXPECTED,
  MSG_REFNAME_EXPECTED,
  MSG_REFNAME_NO_PARAMS_EXPECTED,
  MSG_UNKNOWN_LATEX_COMMAND,
  MSG_UNMATCHED_BEGIN_END,
  MSG_UNMATCHED_BRACES,
  MSG_UNEXPECTED_TOKEN,
  MSG_SYNTAX_ERROR,
  MSG_STROKE_IN_OPNAME;
}
