package com.bdpz.labs.model;

import java.io.Serializable;

public interface CustomEntity<ID extends Serializable> {
	
    ID getId();
    
}
