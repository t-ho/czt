
/*
THIS FILE WAS GENERATED BY GNAST.
ANY MODIFICATIONS TO THIS FILE WILL BE LOST UPON REGENERATION.

************************************************************

Copyright 2003 Mark Utting
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
package net.sourceforge.czt.z.visitor;

import net.sourceforge.czt.z.ast.*;

/**
 * An interface that collects all single visitor interfaces
 * contained in this package.
 *
 * @author Gnast version 0.1
 */
public interface CoreVisitor
  extends
    net.sourceforge.czt.z.visitor.FreetypeVisitor,
    net.sourceforge.czt.z.visitor.Exists1ExprVisitor,
    net.sourceforge.czt.z.visitor.ParenAnnVisitor,
    net.sourceforge.czt.z.visitor.NameNamePairVisitor,
    net.sourceforge.czt.z.visitor.ApplExprVisitor,
    net.sourceforge.czt.z.visitor.LetExprVisitor,
    net.sourceforge.czt.z.visitor.SignatureVisitor,
    net.sourceforge.czt.z.visitor.ConstDeclVisitor,
    net.sourceforge.czt.z.visitor.NextStrokeVisitor,
    net.sourceforge.czt.z.visitor.InStrokeVisitor,
    net.sourceforge.czt.z.visitor.RefNameVisitor,
    net.sourceforge.czt.z.visitor.MemPredVisitor,
    net.sourceforge.czt.z.visitor.ProdTypeVisitor,
    net.sourceforge.czt.z.visitor.ImpliesExprVisitor,
    net.sourceforge.czt.z.visitor.MuExprVisitor,
    net.sourceforge.czt.z.visitor.OrPredVisitor,
    net.sourceforge.czt.z.visitor.ExistsExprVisitor,
    net.sourceforge.czt.z.visitor.VarDeclVisitor,
    net.sourceforge.czt.z.visitor.NarrSectVisitor,
    net.sourceforge.czt.z.visitor.FreeParaVisitor,
    net.sourceforge.czt.z.visitor.CompExprVisitor,
    net.sourceforge.czt.z.visitor.BindExprVisitor,
    net.sourceforge.czt.z.visitor.CondExprVisitor,
    net.sourceforge.czt.z.visitor.ForallExprVisitor,
    net.sourceforge.czt.z.visitor.NarrParaVisitor,
    net.sourceforge.czt.z.visitor.TruePredVisitor,
    net.sourceforge.czt.z.visitor.NameVisitor,
    net.sourceforge.czt.z.visitor.NumExprVisitor,
    net.sourceforge.czt.z.visitor.NameExprPairVisitor,
    net.sourceforge.czt.z.visitor.TupleSelExprVisitor,
    net.sourceforge.czt.z.visitor.LambdaExprVisitor,
    net.sourceforge.czt.z.visitor.IffExprVisitor,
    net.sourceforge.czt.z.visitor.IffPredVisitor,
    net.sourceforge.czt.z.visitor.FalsePredVisitor,
    net.sourceforge.czt.z.visitor.TypeEnvAnnVisitor,
    net.sourceforge.czt.z.visitor.UnparsedZSectVisitor,
    net.sourceforge.czt.z.visitor.UnparsedParaVisitor,
    net.sourceforge.czt.z.visitor.ImpliesPredVisitor,
    net.sourceforge.czt.z.visitor.NameTypePairVisitor,
    net.sourceforge.czt.z.visitor.SchTextVisitor,
    net.sourceforge.czt.z.visitor.OperandVisitor,
    net.sourceforge.czt.z.visitor.ProjExprVisitor,
    net.sourceforge.czt.z.visitor.BranchVisitor,
    net.sourceforge.czt.z.visitor.TypeAnnVisitor,
    net.sourceforge.czt.z.visitor.GenTypeVisitor,
    net.sourceforge.czt.z.visitor.OptempParaVisitor,
    net.sourceforge.czt.z.visitor.ExistsPredVisitor,
    net.sourceforge.czt.z.visitor.NameSectTypeTripleVisitor,
    net.sourceforge.czt.z.visitor.NegPredVisitor,
    net.sourceforge.czt.z.visitor.PreExprVisitor,
    net.sourceforge.czt.z.visitor.SectTypeEnvAnnVisitor,
    net.sourceforge.czt.z.visitor.ExprPredVisitor,
    net.sourceforge.czt.z.visitor.GivenTypeVisitor,
    net.sourceforge.czt.z.visitor.InclDeclVisitor,
    net.sourceforge.czt.z.visitor.SchemaTypeVisitor,
    net.sourceforge.czt.z.visitor.BindSelExprVisitor,
    net.sourceforge.czt.z.visitor.DeclNameVisitor,
    net.sourceforge.czt.z.visitor.ForallPredVisitor,
    net.sourceforge.czt.z.visitor.OrExprVisitor,
    net.sourceforge.czt.z.visitor.SpecVisitor,
    net.sourceforge.czt.z.visitor.LocAnnVisitor,
    net.sourceforge.czt.z.visitor.PowerExprVisitor,
    net.sourceforge.czt.z.visitor.HideExprVisitor,
    net.sourceforge.czt.z.visitor.GivenParaVisitor,
    net.sourceforge.czt.z.visitor.PowerTypeVisitor,
    net.sourceforge.czt.z.visitor.AndExprVisitor,
    net.sourceforge.czt.z.visitor.RenameExprVisitor,
    net.sourceforge.czt.z.visitor.AndPredVisitor,
    net.sourceforge.czt.z.visitor.ConjParaVisitor,
    net.sourceforge.czt.z.visitor.NumStrokeVisitor,
    net.sourceforge.czt.z.visitor.ZSectVisitor,
    net.sourceforge.czt.z.visitor.ThetaExprVisitor,
    net.sourceforge.czt.z.visitor.SetExprVisitor,
    net.sourceforge.czt.z.visitor.SetCompExprVisitor,
    net.sourceforge.czt.z.visitor.PipeExprVisitor,
    net.sourceforge.czt.z.visitor.RefExprVisitor,
    net.sourceforge.czt.z.visitor.NegExprVisitor,
    net.sourceforge.czt.z.visitor.ProdExprVisitor,
    net.sourceforge.czt.z.visitor.DecorExprVisitor,
    net.sourceforge.czt.z.visitor.OutStrokeVisitor,
    net.sourceforge.czt.z.visitor.ParentVisitor,
    net.sourceforge.czt.z.visitor.Exists1PredVisitor,
    net.sourceforge.czt.z.visitor.AxParaVisitor,
    net.sourceforge.czt.z.visitor.SchExprVisitor,
    net.sourceforge.czt.z.visitor.TupleExprVisitor,
    net.sourceforge.czt.util.Visitor
{
}
