package com.pwijaya.compose.basic_layout.ui.components

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pwijaya.compose.R
import com.pwijaya.compose.basic_layout.DrawableStringPair
import com.pwijaya.compose.ui.theme.JetpackComposePlaygroundTheme

@Composable
fun FavoriteCollectionCard(
    @DrawableRes imgResource: Int,
    @StringRes text: Int,
    modifier: Modifier = Modifier
) {
    Surface(
        shape = MaterialTheme.shapes.small,
        modifier = modifier
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.width(192.dp)
        ) {
            Image(
                painter = painterResource(id = imgResource),
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(56.dp)
            )
            Text(
                text = stringResource(id = text),
                style = MaterialTheme.typography.h3,
                modifier = Modifier.padding(horizontal = 16.dp)
            )
        }

    }
}

@Composable
fun FavoriteGrid(
    data: List<DrawableStringPair>,
    modifier: Modifier = Modifier
) {
    LazyHorizontalGrid(
        rows = GridCells.Fixed(2),
        contentPadding = PaddingValues(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier.height(120.dp)
    ) {
        items(data) { item ->
            FavoriteCollectionCard(
                imgResource = item.drawable,
                text = item.text,
                modifier = Modifier.height(56.dp)
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun FavoriteCollectionCardPreview() {
    JetpackComposePlaygroundTheme {
        FavoriteCollectionCard(
            imgResource = R.drawable.fc2_nature_meditations,
            text = R.string.fc2_nature_meditations
        )
    }
}