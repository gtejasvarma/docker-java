package com.github.dockerjava.api.command;

import java.util.List;

import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

import com.github.dockerjava.api.exception.DockerException;
import com.github.dockerjava.api.exception.InternalServerErrorException;
import com.github.dockerjava.api.exception.NotFoundException;
import com.github.dockerjava.api.model.ChangeLog;

public interface ContainerDiffCmd extends SyncDockerCmd<List<ChangeLog>> {

    @CheckForNull
    public String getContainerId();

    public ContainerDiffCmd withContainerId(@Nonnull String containerId);

    @Override
    public String toString();

    /**
     * @throws NotFoundException
     *             No such container
     * @throws InternalServerErrorException
     *             server error
     * @throws DockerException
     *             unexpected http status code
     */
    @Override
    public List<ChangeLog> exec() throws NotFoundException;

    public static interface Exec extends DockerCmdSyncExec<ContainerDiffCmd, List<ChangeLog>> {
    }

}