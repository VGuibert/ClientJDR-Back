package com.perso.ClientJDR.config.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

@NoRepositoryBean
public interface ClientJdrRepository <T, S extends Serializable> extends JpaRepository<T, S>{

    /**
     * @return the entity type
     */
    default Class<T> getEntityType() {
        final Type[] interfaces = getClass().getInterfaces();

        for (final Type t : interfaces) {
            if (t instanceof Class<?> clazz && (clazz.getPackage().getName().startsWith("com.perso.ClientJDR"))) {

                // Repositories should implement only ONE interface from application packages

                final Type genericInterface = clazz.getGenericInterfaces()[0];

                return (Class<T>) ((ParameterizedType) genericInterface).getActualTypeArguments()[0];

            }
        }

        return null;
    }

}
