// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$251 {

    static final FunctionDescriptor GetVolumePathNameA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetVolumePathNameA$MH = RuntimeHelper.downcallHandle(
        "GetVolumePathNameA",
        constants$251.GetVolumePathNameA$FUNC
    );
    static final FunctionDescriptor GetVolumePathNamesForVolumeNameA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetVolumePathNamesForVolumeNameA$MH = RuntimeHelper.downcallHandle(
        "GetVolumePathNamesForVolumeNameA",
        constants$251.GetVolumePathNamesForVolumeNameA$FUNC
    );
    static final FunctionDescriptor CreateActCtxA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateActCtxA$MH = RuntimeHelper.downcallHandle(
        "CreateActCtxA",
        constants$251.CreateActCtxA$FUNC
    );
    static final FunctionDescriptor CreateActCtxW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateActCtxW$MH = RuntimeHelper.downcallHandle(
        "CreateActCtxW",
        constants$251.CreateActCtxW$FUNC
    );
    static final FunctionDescriptor AddRefActCtx$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddRefActCtx$MH = RuntimeHelper.downcallHandle(
        "AddRefActCtx",
        constants$251.AddRefActCtx$FUNC
    );
    static final FunctionDescriptor ReleaseActCtx$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReleaseActCtx$MH = RuntimeHelper.downcallHandle(
        "ReleaseActCtx",
        constants$251.ReleaseActCtx$FUNC
    );
}


