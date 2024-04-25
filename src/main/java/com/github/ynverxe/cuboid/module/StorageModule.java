package com.github.ynverxe.cuboid.module;

import com.github.ynverxe.modulator.ExecutionContext;
import com.github.ynverxe.modulator.ExecutionPriority;
import com.github.ynverxe.modulator.Module;
import com.github.ynverxe.modulator.ModuleCategory;
import org.jetbrains.annotations.NotNull;

public class StorageModule implements Module {

  private final
  private final int priority;



  @Override
  public void load(@NotNull ExecutionContext context) throws Throwable {

  }

  @Override
  public @NotNull ExecutionPriority executionPriority() {
    return new ExecutionPriority(ModuleCategory.INITIALIZATION, priority);
  }
}