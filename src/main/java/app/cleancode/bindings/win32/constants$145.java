// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$145 {

    static final FunctionDescriptor OpenJobObjectA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OpenJobObjectA$MH = RuntimeHelper.downcallHandle(
        "OpenJobObjectA",
        constants$145.OpenJobObjectA$FUNC
    );
    static final FunctionDescriptor CreateJobSet$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CreateJobSet$MH = RuntimeHelper.downcallHandle(
        "CreateJobSet",
        constants$145.CreateJobSet$FUNC
    );
    static final FunctionDescriptor FindFirstVolumeA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle FindFirstVolumeA$MH = RuntimeHelper.downcallHandle(
        "FindFirstVolumeA",
        constants$145.FindFirstVolumeA$FUNC
    );
    static final FunctionDescriptor FindNextVolumeA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle FindNextVolumeA$MH = RuntimeHelper.downcallHandle(
        "FindNextVolumeA",
        constants$145.FindNextVolumeA$FUNC
    );
    static final FunctionDescriptor FindFirstVolumeMountPointA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle FindFirstVolumeMountPointA$MH = RuntimeHelper.downcallHandle(
        "FindFirstVolumeMountPointA",
        constants$145.FindFirstVolumeMountPointA$FUNC
    );
    static final FunctionDescriptor FindFirstVolumeMountPointW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle FindFirstVolumeMountPointW$MH = RuntimeHelper.downcallHandle(
        "FindFirstVolumeMountPointW",
        constants$145.FindFirstVolumeMountPointW$FUNC
    );
}


