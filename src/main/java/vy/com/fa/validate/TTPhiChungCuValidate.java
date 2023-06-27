package vy.com.fa.validate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import vy.com.fa.dto.TTPhiChungCuDTO;
import vy.com.fa.repository.ToaNhaRepository;
@Component
public class TTPhiChungCuValidate implements Validator{

	@Autowired
	private ToaNhaRepository nhaRepository;
	
	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return clazz.equals(TTPhiChungCuDTO.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		if (!(target instanceof TTPhiChungCuDTO)) {
			return;
		}
		TTPhiChungCuDTO TTPhiChungCuDTO = (TTPhiChungCuDTO) target;
		if (!nhaRepository.existsById(TTPhiChungCuDTO.getMatoanha())&& !"".equals(TTPhiChungCuDTO.getMatoanha())) {
			errors.rejectValue("matoanha", null, "Mã toà nhà không tồn tại");
		}
		
	}

}
