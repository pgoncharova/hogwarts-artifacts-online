package edu.tcu.cs.hogwartsartifactsonline.artifact.converter;

import edu.tcu.cs.hogwartsartifactsonline.artifact.dto.WizardDto;
import edu.tcu.cs.hogwartsartifactsonline.wizard.Wizard;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class WizardToWizardDtoConverter implements Converter<Wizard, WizardDto> {
    @Override
    public WizardDto convert(Wizard source) {
        WizardDto wizardDto = new WizardDto(source.getId(),
                source.getName(), source.getNumberOfArtifacts());
        return wizardDto;
    }
}
