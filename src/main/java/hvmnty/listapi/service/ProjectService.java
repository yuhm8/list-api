package hvmnty.listapi.service;

import hvmnty.listapi.domain.Project;
import hvmnty.listapi.domain.ProjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProjectService {

    private ProjectRepository projectRepository;

    public List<Project> findAll() {
        return projectRepository.findAll();
    }
}
