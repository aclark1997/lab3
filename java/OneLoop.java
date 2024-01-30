import java.util.ArrayList;

class OneLoop
{
	public static boolean Duplicates(ArrayList<Integer> list){
		for(int i = 0; i < list.size(); i++){
			for(int j = i; j < list.size(); j++){
				if(i != j && list.get(i) == list.get(j)){
					return true;
				}
			}
		}
		return false;
	}

    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
	list.add(2);
	list.add(4);
	list.add(3);
	System.out.println(Duplicates(list));
    }
};
