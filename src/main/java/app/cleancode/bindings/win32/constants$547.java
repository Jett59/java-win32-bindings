// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$547 {

    static final FunctionDescriptor SHAppBarMessage$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SHAppBarMessage$MH = RuntimeHelper.downcallHandle(
        "SHAppBarMessage",
        constants$547.SHAppBarMessage$FUNC
    );
    static final FunctionDescriptor DoEnvironmentSubstA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DoEnvironmentSubstA$MH = RuntimeHelper.downcallHandle(
        "DoEnvironmentSubstA",
        constants$547.DoEnvironmentSubstA$FUNC
    );
    static final FunctionDescriptor DoEnvironmentSubstW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DoEnvironmentSubstW$MH = RuntimeHelper.downcallHandle(
        "DoEnvironmentSubstW",
        constants$547.DoEnvironmentSubstW$FUNC
    );
    static final FunctionDescriptor ExtractIconExA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ExtractIconExA$MH = RuntimeHelper.downcallHandle(
        "ExtractIconExA",
        constants$547.ExtractIconExA$FUNC
    );
    static final FunctionDescriptor ExtractIconExW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ExtractIconExW$MH = RuntimeHelper.downcallHandle(
        "ExtractIconExW",
        constants$547.ExtractIconExW$FUNC
    );
    static final FunctionDescriptor SHFileOperationA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SHFileOperationA$MH = RuntimeHelper.downcallHandle(
        "SHFileOperationA",
        constants$547.SHFileOperationA$FUNC
    );
}


