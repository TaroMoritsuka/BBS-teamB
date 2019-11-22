package com.example.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.example.domain.IdolDomain;

@Repository
public class IdolRepository {
	public static final RowMapper<IdolDomain> IDOLDOMAIN_ROW_MAPPER = (rs, i) -> {
		IdolDomain idolDomain = new IdolDomain();
		idolDomain.setId(rs.getInt("id"));
		idolDomain.setName(rs.getString("name"));
		idolDomain.setAge(rs.getInt("age"));
		idolDomain.setBirthPlace(rs.getString("birth_place"));

		return idolDomain;
	};

	@Autowired
	private NamedParameterJdbcTemplate template;

	
	public IdolDomain findById(int id) {
		String sql = "SELECT id,name,age,birth_place FROM idols WHERE id=:id ORDER BY age DESC;";
		SqlParameterSource param = new MapSqlParameterSource().addValue("id", id);
		return template.queryForObject(sql, param, IDOLDOMAIN_ROW_MAPPER);


	}
	
	public List<IdolDomain> findAll() {
		String sql = "SELECT id,name,age,birth_place FROM idols ORDER BY age DESC";
		List<IdolDomain> IdleList = template.query(sql, IDOLDOMAIN_ROW_MAPPER);
		return IdleList;

	}
	
	
	

	

}
