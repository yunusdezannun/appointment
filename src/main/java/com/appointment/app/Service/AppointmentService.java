package com.appointment.app.Service;

import com.appointment.app.Repository.AppointmentRepository;
import com.appointment.app.Repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AppointmentService {

    @Autowired
    private final AppointmentRepository AppointmentRepo;
}
