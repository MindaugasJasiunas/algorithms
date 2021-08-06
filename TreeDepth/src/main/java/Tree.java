import java.util.ArrayList;
import java.util.List;

public class Tree {
    /**
     * Method that searches tree depth using recursion
     *
     * @param branch
     * @return int value of tree depth
     */
    public int getDepth(TreeBranch branch) {
        if (branch == null) {
            return 0;
        }
        int deepest = 0;

        if (branch.getBranches() != null) {
            for (TreeBranch treeBranch : branch.getBranches()) {
                deepest = Math.max(deepest, getDepth(treeBranch));
            }
        }
        return deepest + 1; //deepest + current branch
    }

}


class TreeBranch {
    private List<TreeBranch> branches;

    public TreeBranch() {
        branches = new ArrayList<>();
    }

    public void setBranch(TreeBranch branch) {
        if (branch != null) {
            branches.add(branch);
        }
    }

    public List<TreeBranch> getBranches() {
        return branches;
    }

}