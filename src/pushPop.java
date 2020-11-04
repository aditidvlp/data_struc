import java.util.*;

class pushPop{
    public static int[] maxMin(String operations[],int x[]){//method finds the product of min and max element after each operation
        Set<Integer> elements = new HashSet<Integer>();
        List<Integer> list;
        int f,l;
        int temp[]=new int[10];
        for(int i=0;i<10;i++){//for each operation
            if(operations[i].equals("push")){//if operation is push
                elements.add(x[i]);//insert element
                list= new ArrayList<Integer>(elements);
                Collections.sort(list);//convert set to list and sort
                f=list.get(0);//get the min and max elements and product them
                l=list.get(list.size()-1);
                temp[i]=f*l;//insert the product to array
            }
            else if(operations[i].equals("pop")){//if operation is pop
                elements.remove(x[i]);
                list= new ArrayList<Integer>(elements);
                Collections.sort(list);
                f=list.get(0);//get the min and max elements and product them
                l=list.get(list.size()-1);
                temp[i]=f*l;//insert the product to array
            }
        }
        return temp;//return the resultant array
    }
    public static void main (String[] args) {//main method
        String s[]={"push","push","push","push","pop","push","pop","pop","push","pop","push"};
        int t[]={1,2,3,4,1,5,2,3,6,4,7};//create string of operations and list of elements
        int res[]=maxMin(s,t);//call function
        for(int i=0;i<10;i++){
            System.out.println(res[i]);//print output
        }
    }
}