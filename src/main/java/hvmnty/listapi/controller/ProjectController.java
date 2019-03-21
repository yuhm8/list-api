package hvmnty.listapi.controller;

import hvmnty.listapi.domain.Project;
import hvmnty.listapi.service.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProjectController {

    private ProjectService projectService;

    @GetMapping("/")
    public ResponseEntity<ProjectResponse> findAll() {
        List<Project> projects = projectService.findAll();
        ProjectResponse projectResponse = ProjectResponse.builder()
                .projects(projects)
                .build();
        return new ResponseEntity<>(projectResponse, HttpStatus.OK);
    }
}
