package Dao;

import java.util.*;

public class BookDaoImpl implements BookDao{

	public List<String> getBooks() {
		System.out.println("i am called");
		return Arrays.asList("java adv","java basics","rich dad poor dad");
	}

}
