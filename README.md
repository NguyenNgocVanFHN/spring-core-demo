# spring-core-demo
Fix:
HibernateException: get is not valid without active transaction
public T findById(Serializable key) {
		return (T) getSession().get(persistentClass, key);
}
