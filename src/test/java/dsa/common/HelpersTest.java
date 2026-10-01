package dsa.common;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelpersTest {

    @Test
    void listNodeRoundTrip() {
        assertArrayEquals(new int[]{1, 2, 3}, ListNode.toArray(ListNode.of(1, 2, 3)));
        assertNull(ListNode.of());
    }

    @Test
    void treeNodeFromLevelOrder() {
        TreeNode root = TreeNode.of(3, 9, 20, null, null, 15, 7);
        assertEquals(3, root.val);
        assertEquals(9, root.left.val);
        assertNull(root.left.left);
        assertEquals(15, root.right.left.val);
        assertEquals(7, root.right.right.val);
    }
}
