package com.reduber.hungr;

/**
 * Represents an item in a ToDo list
 */
public class FoodItem {

	/**
	 * Item text
	 */
	@com.google.gson.annotations.SerializedName("name")
	private String mName;

	/**
	 * Item Id
	 */
	@com.google.gson.annotations.SerializedName("id")
	private String mId;

	/**
	 * Indicates if the item is completed
	 */
	@com.google.gson.annotations.SerializedName("price")
	private double mPrice;

	/**
	 * ToDoItem constructor
	 */
	public FoodItem() {

	}

	@Override
	public String toString() {
		return getName();
	}

	/**
	 * Initializes a new ToDoItem
	 * 
	 * @param text
	 *            The item text
	 * @param id
	 *            The item id
	 */
	public FoodItem(String text, String id) {
		this.setName(text);
		this.setId(id);
	}

	/**
	 * Returns the item text
	 */
	public String getName() {
		return mName;
	}

    public void setName(String name){mName = name;}

	/**
	 * Returns the item id
	 */
	public String getId() {
		return mId;
	}

	/**
	 * Sets the item id
	 * 
	 * @param id
	 *            id to set
	 */
	public final void setId(String id) {
		mId = id;
	}

	/**
	 * Indicates if the item is marked as completed
	 */
	public double getPrice() {
		return mPrice;
	}

	/**
	 * Marks the item as completed or incompleted
	 */
	public void setComplete(double price) {
		mPrice = price;
	}

	@Override
	public boolean equals(Object o) {
		return o instanceof FoodItem && ((FoodItem) o).mId == mId;
	}
}
