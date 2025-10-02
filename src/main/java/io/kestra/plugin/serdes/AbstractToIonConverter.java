package io.kestra.plugin.serdes;

import io.kestra.core.models.annotations.PluginProperty;
import io.kestra.core.models.property.Property;
import io.kestra.core.models.tasks.Task;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class AbstractToIonConverter extends Task {

    @NotNull
    @PluginProperty(internalStorageURI = true)
    /*
     * Location (URI) of the input file as every ToIon task needs to have an input file
     */

    protected Property<String> from;

    @Builder.Default
    @PluginProperty
    // The behavior when a line can't be parsed (ex. corrupted format)

    protected final Property<OnBadLines> onBadLines = Property.ofValue(OnBadLines.ERROR);

}