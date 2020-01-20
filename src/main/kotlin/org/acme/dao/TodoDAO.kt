  
package org.acme.dao

import org.acme.model.Todo
import java.util.*
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class TodoDAO {

    fun findAll() = Arrays.asList(Todo("a"), Todo("b"), Todo("c"))
    fun create(todo: Todo): Todo = Todo("a")

}