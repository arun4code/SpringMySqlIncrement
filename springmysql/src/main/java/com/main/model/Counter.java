package com.main.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * @author arun
 *
 */
@Entity
@Table(name = "counter", uniqueConstraints = @UniqueConstraint(columnNames = "id"))
public class Counter implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	private Long counter;

	public Long getCounter() {
		return counter;
	}

	public void setCounter(Long counter) {
		this.counter = counter;
	}

	@Override
	public String toString() {
		return "Counter [id=" + id + ", counter=" + counter + "]";
	}

}