import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreeTest {
    private final Tree tree = new Tree();

    @DisplayName("getDepth() - depth is 5")
    @Test
    void getDepth() {
        /*
         * Testing tree visual representation with branch numbers:
         *
         *     (0)
         *    /   \
         *  (2)   (10)
         *  /    / | \
         *(1)  (8)(6)(9)
         *     /  /\
         *   (7)(4)(5)
         *       |
         *      (3)
         *
         */

        //creating branches and branches in branches
        TreeBranch branch1 = new TreeBranch();
        TreeBranch branch2 = new TreeBranch();
        branch2.setBranch(branch1);

        TreeBranch branch3 = new TreeBranch();
        TreeBranch branch4 = new TreeBranch();
        branch4.setBranch(branch3);

        TreeBranch branch5 = new TreeBranch();
        TreeBranch branch6 = new TreeBranch();
        branch6.setBranch(branch5);
        branch6.setBranch(branch4);

        TreeBranch branch7 = new TreeBranch();
        TreeBranch branch8 = new TreeBranch();
        branch8.setBranch(branch7);

        TreeBranch branch9 = new TreeBranch();
        TreeBranch branch10 = new TreeBranch();
        branch10.setBranch(branch9);
        branch10.setBranch(branch6);
        branch10.setBranch(branch8);

        //root branch
        TreeBranch branch0 = new TreeBranch();
        branch0.setBranch(branch2);
        branch0.setBranch(branch10);

        assertEquals(5, tree.getDepth(branch0));
    }

    @DisplayName("getDepth() with null value - depth is 0")
    @Test
    void getDepth_nullValue() {
        assertEquals(0, tree.getDepth(null));
    }

    @DisplayName("getDepth() with 1 branch - depth is 1")
    @Test
    void getDepth_oneBranch() {
        TreeBranch branch1 = new TreeBranch();
        assertEquals(1, tree.getDepth(branch1));
    }
}