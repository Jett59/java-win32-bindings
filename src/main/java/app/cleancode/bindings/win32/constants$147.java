// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$147 {

    static final FunctionDescriptor GetVolumeNameForVolumeMountPointA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetVolumeNameForVolumeMountPointA$MH = RuntimeHelper.downcallHandle(
        "GetVolumeNameForVolumeMountPointA",
        constants$147.GetVolumeNameForVolumeMountPointA$FUNC
    );
    static final FunctionDescriptor GetVolumePathNameA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetVolumePathNameA$MH = RuntimeHelper.downcallHandle(
        "GetVolumePathNameA",
        constants$147.GetVolumePathNameA$FUNC
    );
    static final FunctionDescriptor GetVolumePathNamesForVolumeNameA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetVolumePathNamesForVolumeNameA$MH = RuntimeHelper.downcallHandle(
        "GetVolumePathNamesForVolumeNameA",
        constants$147.GetVolumePathNamesForVolumeNameA$FUNC
    );
    static final FunctionDescriptor CreateActCtxA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateActCtxA$MH = RuntimeHelper.downcallHandle(
        "CreateActCtxA",
        constants$147.CreateActCtxA$FUNC
    );
    static final FunctionDescriptor CreateActCtxW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateActCtxW$MH = RuntimeHelper.downcallHandle(
        "CreateActCtxW",
        constants$147.CreateActCtxW$FUNC
    );
    static final FunctionDescriptor AddRefActCtx$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddRefActCtx$MH = RuntimeHelper.downcallHandle(
        "AddRefActCtx",
        constants$147.AddRefActCtx$FUNC
    );
}


