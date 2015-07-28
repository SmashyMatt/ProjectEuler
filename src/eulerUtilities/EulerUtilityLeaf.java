package eulerUtilities;

import java.util.ArrayList;

public class EulerUtilityLeaf {
	private Integer nodeValue = 0;
	private Integer leftMaxValue = 0;
	private Integer rightMaxValue = 0;
	private Integer nodeMaxValue = (Integer) null;
	private Integer nodeRow = 0;
	private Integer nodeIndex = 0;
	private ArrayList<Integer> valueArray = null;
	private EulerUtilityLeaf leftChild = null;
	private EulerUtilityLeaf rightChild = null;
	private EulerUtilityLeaf nodeParent = null;

	public EulerUtilityLeaf CreateTopLeaf(ArrayList<Integer> incomingArray) {
		valueArray = incomingArray;
		nodeRow = 1;
		nodeIndex = 0;
		nodeValue = valueArray.get(nodeIndex);
		this.CreateChild("L");
		this.CreateChild("R");
		return this;
	}

	public EulerUtilityLeaf CreateLeaf(EulerUtilityLeaf parent, int index) {
		nodeParent = parent;
		nodeRow = parent.GetRow() + 1;
		nodeIndex = index;
		valueArray = parent.GetValueArray();
		nodeValue = valueArray.get(nodeIndex);
		this.CreateChild("L");
		this.CreateChild("R");
		return this;
	}

	public void CreateChild(String orientation) {
		if (orientation.equalsIgnoreCase("L")) {
			if (nodeParent == null) {
				if (this.GetChildValue(nodeIndex + 1) != null) {
					leftChild = new EulerUtilityLeaf().CreateLeaf(this,
							nodeIndex + nodeRow);
				} else {
					leftChild = null;
				}
			} else if (nodeParent.GetLeftChild() == null) {
				if (nodeParent.GetChildValue(nodeIndex + nodeRow) != (Integer) null) {
					leftChild = new EulerUtilityLeaf().CreateLeaf(this,
							nodeIndex + nodeRow);
				}
			} else if (nodeParent.GetLeftChild().GetRightChild() != null) {
				leftChild = nodeParent.GetLeftChild().GetRightChild();
			} else {
				leftChild = null;
			}

		} else if (orientation.equalsIgnoreCase("R")) {
			if (nodeParent == null) {
				if (this.GetChildValue(nodeIndex + 2) != (Integer) null) {
					rightChild = new EulerUtilityLeaf().CreateLeaf(this,
							nodeIndex + nodeRow + 1);
				} else {
					rightChild = null;
				}
			} else if (nodeParent.GetChildValue(nodeIndex + nodeRow + 1) != (Integer) null) {
				rightChild = new EulerUtilityLeaf().CreateLeaf(this, nodeIndex
						+ nodeRow + 1);
			} else {
				rightChild = null;
			}
		}
	}

	public Integer MaxValue() {
		if (nodeMaxValue != (Integer) null) {
			return nodeMaxValue;
		}
		if (leftChild != null && rightChild != null) {
			leftMaxValue = leftChild.MaxValue() + nodeValue;
			rightMaxValue = rightChild.MaxValue() + nodeValue;
			if (leftMaxValue > rightMaxValue) {
				nodeMaxValue = leftMaxValue;
			} else {
				nodeMaxValue = rightMaxValue;
			}
		} else if (leftChild != null) {
			leftMaxValue = leftChild.MaxValue() + nodeValue;
			nodeMaxValue = leftMaxValue;
		} else if (rightChild != null) {
			rightMaxValue = rightChild.MaxValue() + nodeValue;
			nodeMaxValue = rightMaxValue;
		} else {
			nodeMaxValue = nodeValue;
		}
		return nodeMaxValue;
	}

	public Integer GetChildValue(int childIndex) {
		if (childIndex < valueArray.size()) {
			return valueArray.get(childIndex);
		} else {
			return (Integer) null;
		}
	}

	public EulerUtilityLeaf GetLeftChild() {
		return leftChild;
	}

	public EulerUtilityLeaf GetRightChild() {
		return rightChild;
	}

	public Integer GetRow() {
		return nodeRow;
	}

	public Integer GetIndex() {
		return nodeIndex;
	}

	public ArrayList<Integer> GetValueArray() {
		return valueArray;
	}
}

//

