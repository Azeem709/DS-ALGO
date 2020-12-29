package ds;

public class LinkedList {

    Node head;
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;

        }

    }
        public void insert(int data)
        {
            Node newNode = new Node(data);

          if(head == null)
              head = newNode;
          else
          {
              Node temp = head;
              while (temp.next != null)
              {
                  temp = temp.next;
              }
              temp.next = newNode;
          }

        }


        public void insertAtStart(int data)
        {
            if(head == null)
                System.out.println("EMPTY");
            else {
                Node newNode = new Node(data);
                newNode.next = head;
                head = newNode;
            }
        }

        public void insertAtIndex(int pos,int data)
        {
            if(head == null)
                System.out.println("EMPTY");
            else if (length()>0){
                Node newNode = new Node(data);
                Node temp = head;
                for(int i=0;i<pos-1;i++)
                {
                    temp = temp.next;
                }
                Node nextNode = temp.next;
                temp.next =newNode;
                newNode.next = nextNode;

            }

        }


        public int length()
        {
            if(head == null)
                return 0;
            else
            { int count = 0;
                Node temp = head;
                while (temp.next != null)
                {
                    count++;
                    temp = temp.next;
                }
                return count+1;
            }
        }

        public void show()
        {
            if (head == null)
                System.out.println("EMPTY LIST");
            else
            {
                Node temp = head;
                while (temp.next!=null)
                {
                    System.out.println(temp.data);
                    temp = temp.next;

                }
                System.out.print(temp.data);
            }

        }

public void reverseLL()
{

    Node currentNode = head;
    Node nextNode = null;
    while (currentNode.next != null)
    {
        nextNode = currentNode.next;
        nextNode.next =currentNode;
        currentNode = currentNode.next;
    }
    head = nextNode;
//    head.next = null;
}

    }



