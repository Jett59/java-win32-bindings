// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$202 {

    static final FunctionDescriptor _llseek$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle _llseek$MH = RuntimeHelper.downcallHandle(
        "_llseek",
        constants$202._llseek$FUNC
    );
    static final FunctionDescriptor IsTextUnicode$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IsTextUnicode$MH = RuntimeHelper.downcallHandle(
        "IsTextUnicode",
        constants$202.IsTextUnicode$FUNC
    );
    static final FunctionDescriptor BackupRead$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle BackupRead$MH = RuntimeHelper.downcallHandle(
        "BackupRead",
        constants$202.BackupRead$FUNC
    );
    static final FunctionDescriptor BackupSeek$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle BackupSeek$MH = RuntimeHelper.downcallHandle(
        "BackupSeek",
        constants$202.BackupSeek$FUNC
    );
    static final FunctionDescriptor BackupWrite$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle BackupWrite$MH = RuntimeHelper.downcallHandle(
        "BackupWrite",
        constants$202.BackupWrite$FUNC
    );
    static final FunctionDescriptor OpenMutexA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OpenMutexA$MH = RuntimeHelper.downcallHandle(
        "OpenMutexA",
        constants$202.OpenMutexA$FUNC
    );
}


