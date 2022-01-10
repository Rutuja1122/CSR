package com.CaseStudy.TrainService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.CaseStudy.TrainService.model.Trains;
import com.CaseStudy.TrainService.repository.TrainRepository;
import com.CaseStudy.TrainService.service.TrainService;

@SpringBootTest
class TrainServiceApplicationTests {

	@Autowired
	private TrainService trainService;
	
	@MockBean
	private TrainRepository trainrepository;

		@Test
		public void saveTrainTest() {
			Trains train = new Trains("766U","GoaExpress","Vasco DaGama","Hazrat");
			when(trainrepository.save(train)).thenReturn(train);
			assertEquals(train, trainService.addTrain(train));
		
		}
		@Test
		public void getTrainTest() {
			when(trainrepository.findAll()).thenReturn(Stream
					.of(new Trains("12","Howrah local","Bandel","Howrah"), new Trains("12","Jagannath Express","Howrah","Puri")).collect(Collectors.toList()));
			assertEquals(2,trainService.displayAll().size());
		}
		@Test
		public void deleteUserTest() {
				Trains train = new Trains("766U","GoaExpress","Vasco DaGama","Hazrat");
				trainService.deleteTrain(train);
				verify(trainrepository, times(1)).delete(train);
		}


}