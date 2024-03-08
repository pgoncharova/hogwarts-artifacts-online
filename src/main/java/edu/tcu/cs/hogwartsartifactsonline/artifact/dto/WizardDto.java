package edu.tcu.cs.hogwartsartifactsonline.artifact.dto;

import jakarta.persistence.criteria.CriteriaBuilder;

public record WizardDto (Integer id, String name, Integer numberOfArtifacts){
}
