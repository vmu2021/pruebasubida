package es.mde.rest;

import java.util.List;

import org.springframework.data.rest.webmvc.PersistentEntityResource;
import org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import es.mde.entidades.EmpleadoConId;
import es.mde.entidades.SueldoConId;
import es.mde.repositorios.SueldoDAO;

@RepositoryRestController
@RequestMapping(path = "/sueldos/search")
public class SueldoController {
	private SueldoDAO sueldoDAO;
	public SueldoController(SueldoDAO sueldoDAO) {
		this.sueldoDAO = sueldoDAO;
	}

	@GetMapping("/sueldo-mes")
	@ResponseBody
	public PersistentEntityResource getTotalMes(@RequestParam Long idSueldo,PersistentEntityResourceAssembler assembler){
		SueldoConId sueldoMes = sueldoDAO.getTotalMes(idSueldo);
		return assembler.toModel(sueldoMes);
		
	}
	
	@GetMapping("/sueldos-calculados")
	@ResponseBody
	public CollectionModel<PersistentEntityResource> getListaSueldos(PersistentEntityResourceAssembler assembler){
		List<SueldoConId> sueldos = sueldoDAO.listaSueldosTotales();
			return assembler.toCollectionModel(sueldos);
		
	}	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	
			
	
	
}
