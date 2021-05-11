package com.olympic.cis143.m04.student.tacotruck.set;


import java.util.LinkedHashSet;
import java.util.Set;

import com.olympic.cis143.m04.student.tacotruck.Orders;
import com.olympic.cis143.m04.student.tacotruck.TacoImpl;

public class OrdersSetImpl  implements Orders {
	private Set<TacoImpl> tacoQueue = new LinkedHashSet<>();
    @Override
    public void addOrder(TacoImpl tacoOrder) {
    	tacoQueue.add(tacoOrder);
    }

    @Override
    public boolean hasNext() {
    	if(tacoQueue.isEmpty())
    		return false;
    	return true;	
    }

    @Override
    public TacoImpl closeNextOrder() {
    	if(hasNext()) {
    		TacoImpl taco = tacoQueue.iterator().next();
    		tacoQueue.remove(taco);
    		return taco;
    	}
        return null;
    }

    @Override
    public int howManyOrders() {
    	if(tacoQueue.isEmpty())
    		return 0;
    	return tacoQueue.size();
    }
}
