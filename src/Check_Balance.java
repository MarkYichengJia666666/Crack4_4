import javax.swing.tree.TreeNode;

/**
 * Created by jiayicheng on 17/8/9.
 */
public class Check_Balance {
    int checkheight(TreeNode root)
    {if(root==null) return -1;

        int leftheight=checkheight(root.left);
        if(leftheight==Integer.MIN_VALUE) return Integer.MIN_VALUE;

        int rightheight=checkheight(root.right);
        if(rightheight==Integer.MIN_VALUE) return Integer.MIN_VALUE;

        int heightdiff=leftheight-rightheight;

        if(Math.abs(heightdiff)>1)
        {
            return Integer.MIN_VALUE;
        }
        else
        {
            return Math.max(leftheight,rightheight)+1;
        }


    }

    boolean check(TreeNode a)
    {
        return checkheight(a)!=Integer.MIN_VALUE;
    }
}
