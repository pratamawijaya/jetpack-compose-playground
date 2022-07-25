package com.pwijaya.compose.basic_layout.ui.components.slot_section

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pwijaya.compose.R
import com.pwijaya.compose.basic_layout.alignYourBodyData
import com.pwijaya.compose.basic_layout.ui.components.AlignYourBodyRow
import com.pwijaya.compose.ui.theme.JetpackComposePlaygroundTheme
import java.util.*

/**
 * Material components make heavy use of slot APIs,
 * a pattern Compose introduces to bring in a layer of customization
 * on top of composables. This approach makes components more flexible,
 * as they accept a child element which can configure itself rather than having
 * to expose every configuration parameter of the child. Slots leave an empty space in
 * the UI for the developer to fill as they wish.
 */

@Composable
fun HomeSection(
    @StringRes title: Int,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    Column(modifier) {
        Text(
            text = stringResource(title).uppercase(Locale.getDefault()),
            style = MaterialTheme.typography.h2,
            modifier = Modifier
                .paddingFromBaseline(top = 40.dp, bottom = 8.dp)
                .padding(horizontal = 16.dp)
        )
        content()
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFF0EAE2)
@Composable
fun HomeSectionPreview() {
    JetpackComposePlaygroundTheme() {
        HomeSection(R.string.align_your_body) {
            AlignYourBodyRow(data = alignYourBodyData)
        }
    }
}