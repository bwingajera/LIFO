package com.nokia.model;

import javax.persistence.GenerationType;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;


/**
 * @author sterlite
 *
 */
/**
 * @author sterlite
 *
 */
/**
 * @author sterlite
 *
 */
/**
 * @author sterlite
 *
 */
@Entity
@Table(name = "stack")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Stack {

    @Id
    @GeneratedValue()
    @Column(name = "id")
    private Integer id;
    	
    @Column(name = "value", nullable = false)
    private int value;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}


    
    
}
