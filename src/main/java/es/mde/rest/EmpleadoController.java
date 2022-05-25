package es.mde.rest;

import java.util.List;

import org.springframework.data.rest.webmvc.PersistentEntityResource;
import org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.hateoas.CollectionModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import es.mde.entidades.EmpleadoConId;
import es.mde.repositorios.EmpleadoDAO;


@RepositoryRestController
@RequestMapping(path = "/empleados/search")
public class EmpleadoController {
private EmpleadoDAO empleadoDAO;
	
	public EmpleadoController(EmpleadoDAO empleadoDAO) {
		this.empleadoDAO = empleadoDAO;
	}
	
	@GetMapping("/por-tipo")
	@ResponseBody
	public CollectionModel<PersistentEntityResource> getEmpleadosPorTipo(
			PersistentEntityResourceAssembler assembler, @RequestParam String tipoEmpleado) {

		List<EmpleadoConId> empleados = empleadoDAO.getEmpleadosPorTipo(tipoEmpleado);

		return assembler.toCollectionModel(empleados);
	}
}
