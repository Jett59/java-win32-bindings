// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$325 {

    static final FunctionDescriptor wglUseFontBitmapsW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle wglUseFontBitmapsW$MH = RuntimeHelper.downcallHandle(
        "wglUseFontBitmapsW",
        constants$325.wglUseFontBitmapsW$FUNC
    );
    static final FunctionDescriptor SwapBuffers$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SwapBuffers$MH = RuntimeHelper.downcallHandle(
        "SwapBuffers",
        constants$325.SwapBuffers$FUNC
    );
    static final FunctionDescriptor wglUseFontOutlinesA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle wglUseFontOutlinesA$MH = RuntimeHelper.downcallHandle(
        "wglUseFontOutlinesA",
        constants$325.wglUseFontOutlinesA$FUNC
    );
    static final FunctionDescriptor wglUseFontOutlinesW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle wglUseFontOutlinesW$MH = RuntimeHelper.downcallHandle(
        "wglUseFontOutlinesW",
        constants$325.wglUseFontOutlinesW$FUNC
    );
    static final FunctionDescriptor wglDescribeLayerPlane$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle wglDescribeLayerPlane$MH = RuntimeHelper.downcallHandle(
        "wglDescribeLayerPlane",
        constants$325.wglDescribeLayerPlane$FUNC
    );
    static final FunctionDescriptor wglSetLayerPaletteEntries$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle wglSetLayerPaletteEntries$MH = RuntimeHelper.downcallHandle(
        "wglSetLayerPaletteEntries",
        constants$325.wglSetLayerPaletteEntries$FUNC
    );
}


