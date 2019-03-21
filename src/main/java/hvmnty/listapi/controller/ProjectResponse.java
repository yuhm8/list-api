package hvmnty.listapi.controller;

import hvmnty.listapi.domain.Project;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class ProjectResponse {

    private List<Project> projects;
}
