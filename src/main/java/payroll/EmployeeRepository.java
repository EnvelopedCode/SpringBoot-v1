package payroll;

import org.springframework.data.jpa.repository.JpaRepository;

interface EmployeeRepository extends JpaRepository<Employee, Long> {
    //Esto nos ayuda como un ORM para los query (actualmente repositorio local)
}