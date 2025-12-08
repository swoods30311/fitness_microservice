package com.fitness.aiservice.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Document(collection = "recommendations")
@Data
@Builder
public class Recommendation {
    @Id
    private String id;
    // ... existing code ...
    private String activityId;
    private String activityType;
    private String content;
    private List<String> improvements;
    private List<String> suggestions;
    private List<String> safetyTips;
    private LocalDateTime createdAt;
}