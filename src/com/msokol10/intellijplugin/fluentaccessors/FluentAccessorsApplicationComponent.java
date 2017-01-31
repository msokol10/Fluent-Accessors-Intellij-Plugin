package com.msokol10.intellijplugin.fluentaccessors;

import com.intellij.openapi.components.ApplicationComponent;
import com.intellij.openapi.components.PersistentStateComponent;
import org.jetbrains.annotations.NotNull;

/**
 * Created by msokolov on 31.01.2017.
 */
public class FluentAccessorsApplicationComponent implements ApplicationComponent,
        PersistentStateComponent<FluentAccessorsApplicationComponent.State> {


    private State state = new State();


    public FluentAccessorsApplicationComponent() {
    }


    @Override
    public State getState() {
        return state;
    }

    public void initComponent() {
        // TODO: insert component initialization logic here
    }

    public void disposeComponent() {
        // TODO: insert component disposal logic here
    }


    @NotNull
    public String getComponentName() {
        return "FluentAccessorsApplicationComponent";
    }



    @Override
    public void loadState(final State o) {
        this.state = o;
    }


    public String getSetterPrefix() {
        return this.state.getSetterPrefix();
    }

    public String getGetterPrefix() {
        return this.state.getGetterPrefix();
    }

    public boolean isGeneratingGetters() {
        return this.state.isGenerateGetters();
    }

    public boolean isInvokeExistingSetters() {
        return this.state.isInvokeExistingSetters();
    }

    public void updateSetterPrefix(String setterPrefix) {
        this.state.setSetterPrefix(setterPrefix);
    }

    public void updateGetterPrefix(String getterPrefix) {
        this.state.setGetterPrefix(getterPrefix);
    }

    public void updateIsGeneratingGetters(boolean b) {
        this.state.setGenerateGetters(b);
    }

    public void updateIsInvokeExistingSetters(boolean b) {
        this.state.setInvokeExistingSetters(b);
    }


    public static class State {
        private String setterPrefix;
        private String getterPrefix;
        private boolean generateGetters;
        private boolean invokeExistingSetters;

        public String getSetterPrefix() {
            return setterPrefix;
        }

        public void setSetterPrefix(final String setterPrefix) {
            this.setterPrefix = setterPrefix;
        }

        public String getGetterPrefix() {
            return getterPrefix;
        }

        public void setGetterPrefix(final String getterPrefix) {
            this.getterPrefix = getterPrefix;
        }

        public boolean isGenerateGetters() {
            return generateGetters;
        }

        public void setGenerateGetters(final boolean generateGetters) {
            this.generateGetters = generateGetters;
        }

        public boolean isInvokeExistingSetters() {
            return invokeExistingSetters;
        }

        public void setInvokeExistingSetters(boolean invokeExistingSetters) {
            this.invokeExistingSetters = invokeExistingSetters;
        }
    }
}