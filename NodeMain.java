package A;

public class NodeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node28<Integer, Double> intNode = new Node28 <Integer, Double>();
		Node28<String, Long> StringNode = new Node28 <String, Long>();

		intNode.setInfo(new Integer (3), new Double(4.73));	
		StringNode.setInfo("Chanan", new Long (34));

		System.out.println(intNode.toString()); 	
		System.out.println(StringNode);
	}

}
