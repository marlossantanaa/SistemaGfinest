package br.com.Gfinest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import br.com.Gfinest.model.pessoa;
@Repository
@Transactional
public interface pessoaRepository extends CrudRepository <pessoa,Long>{

}
