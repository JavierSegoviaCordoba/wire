/*
 * Copyright (C) 2024 Square, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.squareup.wire.android.app.kotlin.minsdk

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.squareup.moshi.Moshi
import com.squareup.moshi.adapter
import com.squareup.wire.WireJsonAdapterFactory

class MainActivity : AppCompatActivity() {

  @OptIn(ExperimentalStdlibApi::class)
  private val jsonAdapter = Moshi.Builder()
    .add(WireJsonAdapterFactory())
    .build()
    .adapter<SomeText>()

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    val someText = checkNotNull(jsonAdapter.fromJson("""{"value": "Hi"}"""))
    findViewById<TextView>(R.id.text_view).text = someText.value_
  }
}
