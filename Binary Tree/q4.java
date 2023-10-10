//Diameter of a tree

public class q4 {
//Approch1
//    public static int getHeight(node head){
//        if(head==null){
//            return 0;
//        }
//        return Math.max(getHeight(head.right),getHeight(head.left))+1;
//    }
//    public static int getDiameter(node head){
//        if(head==null){
//            return 0;
//        }
//        int leftheight = getHeight(head.left);
//        int rightheight = getHeight(head.right);
//        int diameterIncludingHead=leftheight+rightheight+1;
//        int leftDiameter = getDiameter(head.left);
//        int rightDiameter = getDiameter(head.right);
//        int maximum =  Math.max(leftDiameter, rightDiameter);
//        maximum = Math.max(maximum,diameterIncludingHead);
//        return maximum;
//    }

//    Approach 2
    static class info{
        int height;
        int diameter;
        public info(int height,int diameter){
            this.height = height;
            this.diameter = diameter;
        }
    }
    public static info getDiameter(node head){
        if(head==null){
            info obj = new info(0,0);
            return obj;
        }
        info leftInfo = getDiameter(head.left);
        info rightInfo = getDiameter(head.right);
        //Diameter including root node
        int rootDiameter = leftInfo.height + rightInfo.height +1;
        //Biggest Diameter
        int diameter = Math.max(Math.max(leftInfo.diameter, rightInfo.diameter),rootDiameter);
        int height = Math.max(leftInfo.height, rightInfo.height)+1;

        return new info(diameter,height);
    }

    public static void main(String[] args) {
        node head = null;
        creatBT BT = new creatBT();
        head = BT.InsertAtleft(head, 1);
        head = BT.InsertAtleft(head, 2);
        head = BT.InsertAtRight(head, 3);
        head = BT.InsertAtRight(head, 4);
//        head = BT.InsertAtleft(head, 5);
        System.out.println(getDiameter(head).diameter);
    }
}
