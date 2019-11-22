package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.IdolDomain;
import com.example.repository.IdolRepository;

/**
 * アプリケーション全体をコントロールするコントローラ.
 * 
 * @author sakai
 *
 */
@Controller
@RequestMapping("/idol")
public class IdolMemberController {

	@Autowired
	private IdolRepository idolRepository;

	/**
	 * メンバー一覧画面を表示します.
	 * 
	 * @return 「メンバー一覧画面」にフォワード
	 */
	@RequestMapping("/findAll")
	public String findAll(Model model) {
		List<IdolDomain> idolList = idolRepository.findAll();
		model.addAttribute("idolList", idolList);
		return "topPage";
	}

	/**
	 * 主キーからメンバー詳細情報を取得する.
	 * 
	 * @param id 主キー
	 * @param model requestスコープ
	 * @return 「メンバー詳細画面」にフォワード
	 */
	@RequestMapping("/showDetail")
	public String showDetail(String id, Model model) {
		IdolDomain idolDomain = idolRepository.findById(Integer.parseInt(id));
		model.addAttribute("idolDomain", idolDomain);
		return "idol";
	}

}
