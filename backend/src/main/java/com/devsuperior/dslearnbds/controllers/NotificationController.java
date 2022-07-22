package com.devsuperior.dslearnbds.controllers;

import com.devsuperior.dslearnbds.dto.NotificationDTO;
import com.devsuperior.dslearnbds.entities.Notification;
import com.devsuperior.dslearnbds.repositories.NotificationRepository;
import com.devsuperior.dslearnbds.services.NotificationService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/notifications")
public class NotificationController {

    @Autowired
    private NotificationService notificationService;

    @GetMapping
    public ResponseEntity<Page<NotificationDTO>> notificationForCurrentUser(Pageable pageable){
        Page<NotificationDTO> page = notificationService.notificationForCurrentUser(pageable);
        return ResponseEntity.ok().body(page);
    }
}
