import React from 'react';
import {StyleSheet,text} from 'react-native'
import axios from 'axios';
import React, {useState} from 'react';
import { StyleSheet, Text, View ,TextInput ,ScrollView ,Image ,TouchableHighlight,Modal} from 'react-native';

export default function App() {
  const apiurl="http://www.omdbapi.com/?i=tt3896198&apikey=3217fdc0";
  const [state,setState]=useState({
    s: "Enter a movie....",
    results: [],
    selected: {}
  });
  const search = () =>{
    axios(apiurl +"&s="+state.s).then(({data})=> {
      let results=data.searchconsole.log(results)
      setState(prevState => {
        return { ...prevState,results: results }
      })
    })
  }
  const openPopup =id =>
  {
    axios(apiurl +"&i="+id).then(({ data }) => {
      let result=data;
      console.log(result);
      setState(prevState => {
        return { ...prevState ,selected: result }
      });
    });
  }
  return (
    <View style={styles.container}>
      <Text style={styles.title}>Movie App</Text>
      <TextInput
      style={styles.searchbox}
      onChangeText={text => setState(prevState =>{
        return {...prevState,s:text}
      })}
      onSubmitEditing={search}
      value={state.s}
      />
      <ScrollView style={styles.results}>
           {state.results.map(RESULT =>
           <TouchableHeighlight onPress={() => openPopup(result.imdbID)}>
           <View key={result.imdbID} style={styles.result}>
             <Image
             source={{uri:result.Poster}}
             style={{
               width:'100%',
               heigth:300
             }}
             resizeMode="cover"
             />
             <Text style={styles.heading}>{result.Title}</Text>
           </View>
           </TouchableHeighlight>
           )}
      </ScrollView>
      <Modal>
         animationType="fade"
         transparent={false}
         visible={(typeof state.selected.Title !="undefined")}
         
         <view style={styles.popup}>
           <Text style={styles.poptitle}>{state.selected.Title}</Text>
           <Text style={{marginBottom :20}}>Rating: {state.selected.tmdbRating}</Text>
           <Text>{state.selected.Plot}</Text>

         </view>
         <TouchableHeighlight
         onPress={ ()=> setState(prevState => {
           return { ...prevState, selected: {} }
         })}
         >
           <Text style={styles.closeBtn}>Close</Text>
         </TouchableHeighlight>

      
      <StatusBar style="auto" />
      </Modal>
    </View>
  );
}


const App = () => {
  return (

    <ScrollView backgroundColor="blue"> 
      <nav backgroundColor="blue">
        <button onClick="">recent</button>
        <button>upcoming</button>
        <button>popular</button>
        </nav>
      <View> 
        <Text>
          <h1>Movies</h1>

        </Text>
        <Image
          source={{
            uri: 'https://lumiere-a.akamaihd.net/v1/images/p_frozen2_18652_f5e1d9da.jpeg'
                    }}
          style={{ width: 400, height: 540}}
        />
      </View>
      <Text>
        <b>Movie</b>   : Frozen2 {"\n"}
        <b>Release </b>: 23 Nov2019 {"\n"}
       <b> Rating </b> : 7.8  {"\n"}
      </Text>
    </ScrollView>
  );
}

export default App;