// This is a generated file. Not intended for manual editing.
package name.kropp.intellij.makefile.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MakefileTopconditional extends PsiElement {

  @NotNull
  List<MakefileBlock> getBlockList();

  @NotNull
  List<MakefileBranch> getBranchList();

}
