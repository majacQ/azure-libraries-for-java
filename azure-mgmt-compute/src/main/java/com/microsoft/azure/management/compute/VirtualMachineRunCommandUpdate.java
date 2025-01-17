/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Describes a Virtual Machine run command.
 */
@JsonFlatten
public class VirtualMachineRunCommandUpdate extends UpdateResource {
    /**
     * The source of the run command script.
     */
    @JsonProperty(value = "properties.source")
    private VirtualMachineRunCommandScriptSource source;

    /**
     * The parameters used by the script.
     */
    @JsonProperty(value = "properties.parameters")
    private List<RunCommandInputParameter> parameters;

    /**
     * The parameters used by the script.
     */
    @JsonProperty(value = "properties.protectedParameters")
    private List<RunCommandInputParameter> protectedParameters;

    /**
     * Optional. If set to true, provisioning will complete as soon as the
     * script starts and will not wait for script to complete.
     */
    @JsonProperty(value = "properties.asyncExecution")
    private Boolean asyncExecution;

    /**
     * Specifies the user account on the VM when executing the run command.
     */
    @JsonProperty(value = "properties.runAsUser")
    private String runAsUser;

    /**
     * Specifies the user account password on the VM when executing the run
     * command.
     */
    @JsonProperty(value = "properties.runAsPassword")
    private String runAsPassword;

    /**
     * The timeout in seconds to execute the run command.
     */
    @JsonProperty(value = "properties.timeoutInSeconds")
    private Integer timeoutInSeconds;

    /**
     * Specifies the Azure storage blob where script output stream will be
     * uploaded.
     */
    @JsonProperty(value = "properties.outputBlobUri")
    private String outputBlobUri;

    /**
     * Specifies the Azure storage blob where script error stream will be
     * uploaded.
     */
    @JsonProperty(value = "properties.errorBlobUri")
    private String errorBlobUri;

    /**
     * The provisioning state, which only appears in the response.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * The virtual machine run command instance view.
     */
    @JsonProperty(value = "properties.instanceView", access = JsonProperty.Access.WRITE_ONLY)
    private VirtualMachineRunCommandInstanceView instanceView;

    /**
     * Get the source of the run command script.
     *
     * @return the source value
     */
    public VirtualMachineRunCommandScriptSource source() {
        return this.source;
    }

    /**
     * Set the source of the run command script.
     *
     * @param source the source value to set
     * @return the VirtualMachineRunCommandUpdate object itself.
     */
    public VirtualMachineRunCommandUpdate withSource(VirtualMachineRunCommandScriptSource source) {
        this.source = source;
        return this;
    }

    /**
     * Get the parameters used by the script.
     *
     * @return the parameters value
     */
    public List<RunCommandInputParameter> parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters used by the script.
     *
     * @param parameters the parameters value to set
     * @return the VirtualMachineRunCommandUpdate object itself.
     */
    public VirtualMachineRunCommandUpdate withParameters(List<RunCommandInputParameter> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get the parameters used by the script.
     *
     * @return the protectedParameters value
     */
    public List<RunCommandInputParameter> protectedParameters() {
        return this.protectedParameters;
    }

    /**
     * Set the parameters used by the script.
     *
     * @param protectedParameters the protectedParameters value to set
     * @return the VirtualMachineRunCommandUpdate object itself.
     */
    public VirtualMachineRunCommandUpdate withProtectedParameters(List<RunCommandInputParameter> protectedParameters) {
        this.protectedParameters = protectedParameters;
        return this;
    }

    /**
     * Get optional. If set to true, provisioning will complete as soon as the script starts and will not wait for script to complete.
     *
     * @return the asyncExecution value
     */
    public Boolean asyncExecution() {
        return this.asyncExecution;
    }

    /**
     * Set optional. If set to true, provisioning will complete as soon as the script starts and will not wait for script to complete.
     *
     * @param asyncExecution the asyncExecution value to set
     * @return the VirtualMachineRunCommandUpdate object itself.
     */
    public VirtualMachineRunCommandUpdate withAsyncExecution(Boolean asyncExecution) {
        this.asyncExecution = asyncExecution;
        return this;
    }

    /**
     * Get specifies the user account on the VM when executing the run command.
     *
     * @return the runAsUser value
     */
    public String runAsUser() {
        return this.runAsUser;
    }

    /**
     * Set specifies the user account on the VM when executing the run command.
     *
     * @param runAsUser the runAsUser value to set
     * @return the VirtualMachineRunCommandUpdate object itself.
     */
    public VirtualMachineRunCommandUpdate withRunAsUser(String runAsUser) {
        this.runAsUser = runAsUser;
        return this;
    }

    /**
     * Get specifies the user account password on the VM when executing the run command.
     *
     * @return the runAsPassword value
     */
    public String runAsPassword() {
        return this.runAsPassword;
    }

    /**
     * Set specifies the user account password on the VM when executing the run command.
     *
     * @param runAsPassword the runAsPassword value to set
     * @return the VirtualMachineRunCommandUpdate object itself.
     */
    public VirtualMachineRunCommandUpdate withRunAsPassword(String runAsPassword) {
        this.runAsPassword = runAsPassword;
        return this;
    }

    /**
     * Get the timeout in seconds to execute the run command.
     *
     * @return the timeoutInSeconds value
     */
    public Integer timeoutInSeconds() {
        return this.timeoutInSeconds;
    }

    /**
     * Set the timeout in seconds to execute the run command.
     *
     * @param timeoutInSeconds the timeoutInSeconds value to set
     * @return the VirtualMachineRunCommandUpdate object itself.
     */
    public VirtualMachineRunCommandUpdate withTimeoutInSeconds(Integer timeoutInSeconds) {
        this.timeoutInSeconds = timeoutInSeconds;
        return this;
    }

    /**
     * Get specifies the Azure storage blob where script output stream will be uploaded.
     *
     * @return the outputBlobUri value
     */
    public String outputBlobUri() {
        return this.outputBlobUri;
    }

    /**
     * Set specifies the Azure storage blob where script output stream will be uploaded.
     *
     * @param outputBlobUri the outputBlobUri value to set
     * @return the VirtualMachineRunCommandUpdate object itself.
     */
    public VirtualMachineRunCommandUpdate withOutputBlobUri(String outputBlobUri) {
        this.outputBlobUri = outputBlobUri;
        return this;
    }

    /**
     * Get specifies the Azure storage blob where script error stream will be uploaded.
     *
     * @return the errorBlobUri value
     */
    public String errorBlobUri() {
        return this.errorBlobUri;
    }

    /**
     * Set specifies the Azure storage blob where script error stream will be uploaded.
     *
     * @param errorBlobUri the errorBlobUri value to set
     * @return the VirtualMachineRunCommandUpdate object itself.
     */
    public VirtualMachineRunCommandUpdate withErrorBlobUri(String errorBlobUri) {
        this.errorBlobUri = errorBlobUri;
        return this;
    }

    /**
     * Get the provisioning state, which only appears in the response.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the virtual machine run command instance view.
     *
     * @return the instanceView value
     */
    public VirtualMachineRunCommandInstanceView instanceView() {
        return this.instanceView;
    }

}
