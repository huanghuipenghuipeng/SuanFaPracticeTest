package LianBiao;

import org.junit.jupiter.api.Test;

public class T11_14 {

      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    /**
     * 2. 两数相加
     */
    @Test
    public void fun1(){
        ListNode l1 = new ListNode();
        ListNode p = null;
        ListNode q = null;
        l1.val = 9;
        l1.next = p;

         p = new ListNode();
        p.val = 9;
        p.next=q;

         q = new ListNode();
        q.val = 9;
        q.next=null;


        ListNode l2 = new ListNode();
         p = null;
         q = null;
        l2.val = 9;
        l2.next = null;

//        p = new ListNode();
//        p.val = 9;
//        p.next=null;

//        q = new ListNode();
//        q.val = 4;
//        q.next=null;

        ListNode listNode = addTwoNumbers(l1, l2);
        while (listNode!=null){
            System.out.print(listNode.val);
            listNode = listNode.next;
        }
    }

    /**
     * 2. 两数相加
     */
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode p = l1,q = l2;
            ListNode l = new ListNode(),z = l;
            int b = 0;
            while (p!=null || q!=null){
                if(p!=null && q!=null){
                        int a= p.val + q.val + b;
                        ListNode m = new ListNode();
                        m.val = a%10;
                        b = a/10;
                        m.next = null;
                        z.next = m;
                        z = m;
                        p=p.next;
                        q=q.next;
                    }else if(p!= null){
                        ListNode m = new ListNode();
                        m.val = (p.val+b)%10;
                        b = (p.val+b)/10;
                        z.next = m;
                        z=m;
                        /*
                            细节：
                                0-1   是不是0-1两个 节点都弄，只弄个位数字，递进的数字，
                                要不被后面数字相加（ b = (p.val+b)/10;），要不在最后补1即可
                         */
//                        if (b!=0){
//                             m = new ListNode();
//                            m.val = b;
//                            m.next = null;
//                            z.next = m;
//                            z = m;
//                        }
                        p=p.next;
                }else {
                    ListNode m = new ListNode();
                    m.val = (q.val+b)%10;
                    b = (q.val+b)/10;
                    z.next = m;
                    z=m;
//                    if (b!=0){
//                        m = new ListNode();
//                        m.val = b;
//                        m.next = null;
//                        z.next = m;
//                        z = m;
//                    }
                    q=q.next;
                }
                }
            if (b!=0){
                ListNode m = new ListNode();
                m.val = 1;
                z.next = m;
                m.next = null;
            }
                return l.next ;
            }
    }
//        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//            int [] a =null;
//            int [] b =null;
//            int c1 = 0,c2 = 0;
//            ListNode p = l1;
//            ListNode q = l2;
//            while (p!=null){
//                a[c1++] = p.val;
//                p = p.next;
//            }
//            while (q!=null){
//                b[c2++] = q.val;
//                q = q.next;
//            }
//             a = new int[c1];
//            b = new int[c2];
//
//            int temp = 0;
//            for (int i = 0; i < c1 / 2; i++) {
//                a[i] = temp;
//                a[i] = a[c1-1-i];
//                a[c1-1-i] = temp;
//            }
//            for (int i = 0; i < c2 / 2; i++) {
//                b[i] = temp;
//                b[i] = b[c2-1-i];
//                b[c2-1-i] = temp;
//            }
//            for (int i = c1-1; i>=0;i--) {
//
//            }
//        }
//
//        public int nums(ListNode l){
//            if (l == null)
//                return 0;
//            for (int i = 0; l.next!=null ; i++) {
//                l = l.next;
//            }
//        }

