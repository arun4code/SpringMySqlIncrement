package com.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.Dao.CounterRepository;
import com.main.model.Counter;

/**
 * @author arun
 *
 */
@Service
public class ApplicationServiceImpl implements ApplicationService {

    @Autowired
    private CounterRepository counterRepo;

	@Override
	public void increment(long id) {
		Counter counter = null;
		try {
			counter = counterRepo.findById(id).
			orElseThrow(() -> new Exception("Not found " + id));
		} catch (Exception e) {			//if not found, insert new record with given id.
			counter = new Counter();
			counter.setCounter(0L);
			counter.setId(id);			
		}
		if(counter != null) {
			Long oldVal = counter.getCounter();
			counter.setCounter(oldVal + 1);
			counterRepo.save(counter);
		}
	}
}
